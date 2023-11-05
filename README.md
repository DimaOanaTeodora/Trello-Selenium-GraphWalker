## Rulare GW Studio din cmd folderul cu jarul

Din cmd
```
java -jar graphwalker-studio-4.3.2.jar
```
Accesare tool
```
localhost:9090/studio.html
```

## Creare proiect Maven de la 0 

*myProject = YouTube-GraphWalker aici*

```
mvn archetype:generate -B -DarchetypeGroupId=org.graphwalker -DarchetypeArtifactId=graphwalker-maven-archetype -DgroupId=com.company -DartifactId=myProject -DarchetypeVersion=LATEST
```
```
cd myProject
```
Rulare
```
mvn compile exec:java -Dexec.mainClass="com.company.Runner"
```

## Comenzi extra de running
Genereaza interfata din modelul facut in GW Studio
```
mvn graphwalker:generate-sources
```
Compileaza
```
mvn compile
```
Porneste testele
```
mvn graphwalker:test
```
## Structura
Web scrapingul propriu zis are loc din **src\main\java\com\company** .java files, iar modelele de testare generate in GW Studio sunt puse in **src\main\resources** si recunoscute dupa campul ```name``` ca si clase de implementat in .java files.
```JSON
{
  "models": [
    {
      "name": "SmallTest",
      "id": "c0bf6a8e-91ef-40db-a68a-7aa7ec1ce9b0",
      ........
```
