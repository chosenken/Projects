#!/bin/sh

clear

echo "This script will quickly set up a new project folder"
echo ""
echo -n "Which subfolder should I make the project in? (Blank for current folder): "
read subFolder

echo -n "What is the Project Name?: "
read projName

if [[ $subFolder ]]; then
	projectPath=$subFolder/$projName
else
	projectPath=$projName
fi

if [ ! -f $projectPath ] ; then
	echo "------------------------------------------"
	echo "Create Project Folders "$projectPath
	echo "------------------------------------------"
	mkdir -p $projectPath
fi

cd $projectPath

mkdir -p "src/main/java"
mkdir -p "src/test/java"
mkdir -p "src/main/resource"
mkdir -p "src/test/resource"

echo "------------------------------------------"
echo "Setting up gradle"
echo "------------------------------------------"

gradle setupBuild

echo "apply plugin:'java'
apply plugin:'eclipse'

repositories{
    mavenCentral()
}

sourceCompatibility = 1.7
version = '1.0'
jar {
    manifest {
        attributes 'Implementation-Title': '"$projName"', 'Implementation-Version': version, 'Main-Class': '"$projName"'
    }
}

dependencies{

    // the production code uses the slf4j logging api at compile time
    compile 'org.slf4j:slf4j-api:1.7.5'

    testCompile \"junit:junit:4.11\"
}" > build.gradle

echo "" > settings.gradle

echo "------------------------------------------"
echo "Setting up Eclipse Project"
echo "------------------------------------------"

gradle eclipse

echo "------------------------------------------"
echo "Creating base Java files"
echo "------------------------------------------"

echo "public class "$projName" {
	public static void main (String args[]) {
		
	}
}" > "src/main/java/"$projName".java"

echo "import static org.junit.Assert.*;

import org.junit.Test;


public class Test"$projName" {

}" > "src/test/java/Test"$projName".java"