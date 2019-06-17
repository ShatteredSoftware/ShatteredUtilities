# ShatteredUtilities
*Not a plugin.*

## About
ShatteredUtilities (ShatteredUtil) is a collection of commonly-repeaded code across my plugins. I've written it to 
reduce the amount of repeated code and allow me to update the code in a more organized way. 

## Supported Versions
* 1.12.2
* 1.13.2
* 1.14.2

I plan to support the most recent release on each of the past three versions actively, as well as any old versions that
do not become too taxing to maintain.

## Features
* NBT Manipulation
* Message sending
* Message placeholder replacing

## Using This Library
Requires Git and Maven.

```bash
git clone https://github.com/ShatteredSuite/ShatteredUtilities
cd ShatteredUtilities
mvn 
```
Add this to your `pom.xml`:
```xml
<dependencies>
    <dependency>
        <groupId>org.projpi</groupId>
        <artifactId>ShatteredUtilities</artifactId>
        <version>1.0.0</version>
        <scope>compile</scope>
    </dependency>
</dependencies>
```

Optionally shade this into your plugin:
```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-shade-plugin</artifactId>
            <version>3.1.0</version>
            <configuration>
                <relocations>
                    <relocation>
                        <pattern>org.projpi.util</pattern>
                        <shadedPattern>your.package.util</shadedPattern>
                    </relocation>
                </relocations>
            </configuration>
            <executions>
                <execution>
                    <phase>package</phase>
                    <goals>
                        <goal>shade</goal>
                    </goals>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>
```

