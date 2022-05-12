# Depminer

Dependency analysis is recognized as an important field of software engineering due to a variety of reasons. There exists a large pool of tools providing assistance to software developers and architects. Analysis of inter- and intra-project dependencies can help provide various insights about the entire development process. There is, however, currently a lack of tools that would support researchers by extracting intra-project dependencies data in a format most suited for further analysis. 

To tackle this we instroduce DepMiner - an open source, language-agnostic tool for mining detailed dependencies data from source code, based on extensive static analysis capabilities of an industry standard IDE. DepMiner can be easily integrated into arbitrary mining pipelines to conduct large-scale source code processing jobs involving intra-project dependencies. It is easily extensible to support other languages of source code, different granularities of analysis, and other use-specific needs

## How it works

To learn more about how DepMiner works and how it can be used check out our [preprint on arxiv](https://arxiv.org/abs/2104.09473)

## Requirements

- JDK version 8u251 (Available [here](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html))
- Gradle [distribution](https://gradle.org/install/)

## Build

Build the project using 

    /gradlew build 
    
or a corresponding Gradle task in your IDE. For more info on how to build Kotlin projects with Gradle see:

- [Kotlin gradle plugin](https://kotlinlang.org/docs/reference/using-gradle.html)
- [Gradle guide](https://guides.gradle.org/building-java-applications/)

## Current Usage

Navigate to Depminer root directory and call ./extract-dependencies.sh [arg1] [arg2] [arg3] with the following arguments:

- arg1 - Input project directory. 
- arg1 - Input project source code root directory. 
- arg2 - A path to directory where you'd like your output file placed.

For instance: 

    ./extract-dependencies.sh testData/testProjects/javaTestProject testData/testProjects/javaTestProject/src . 
    
will run the analysis of javaTestProject located at testData/testProjects in the DepMiner root directory. The analysis output will be places in the Depminer's root directory under the name _"test-output"_ 





