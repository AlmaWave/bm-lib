# Batch Manager Library

Il progetto implementa e gestisce la storicizzazione delle informazione riguardante _Batch Manager Core_, espone inoltre 
le interfacce da implementare per la realizzazione dei batch custom.

# Integrazione della libreria
Per utilizzare la libreria, è necessario configurare il progetto in modo da includere il repository maven come di seguito:
```xml
<repositories>
    <repository>
        <id>releases</id>
        <url>http://10.121.172.156/nexus/content/repositories/releases/</url>
    </repository>
</repositories>
```

ed inserire nelle dipendenze il seguente artefatto:

```xml
<dependency>
    <groupId>it.almawave.ps.batch.manager</groupId>
    <artifactId>bm-lib</artifactId>
    <version>{release_number}</version>
</dependency>
```


# Comando maven per eseguire la scansione del codice sul server SonarQube
mvn sonar:sonar \
-Dsonar.projectKey=batch-manager-lib \
-Dsonar.host.url=http://10.121.172.160:9000 \
-Dsonar.login=0f5df76e1093cff80aed0b649e7e6ae515974747
