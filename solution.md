##Project Purple Cow

### System Requirements
- Java 11+
- Gradle 7
- Docker 20+

### Configuration
The **application.properties** allows the configuration:
- server.port (currently set to **3000**)
- spring.datasource.url (currently set to **/tmp/purplecow**)
- H2 database credentials

These can be changed by updating the default application context or overridden via command line arguments.

### Installation
1. Build the project using gradle:

   `gradle build`


2. Build the docker image:

   `docker build --build-arg JAR_FILE=build/libs/\*.jar -t project-purple-cow .`


3. Run the docker image (adjust host volume and port accordingly):

   `docker run -v ~/:/tmp -p 3000:3000 project-purple-cow`

### Endpoints
- [`GET` Retrieve All Items](docs/RETRIEVE_ALL_ITEMS.md)
- [`GET` Retrieve Item](docs/RETRIEVE_ITEM.md)
- [`POST` Insert Items](docs/INSERT_ITEMS.md)
- [`PUT` Update Item](docs/UPDATE_ITEM.md)
- [`DELETE` Delete All Items](docs/DELETE_ALL_ITEMS.md)
- [`DELETE` Delete Item](docs/DELETE_ITEM.md)

### Outstanding Items

- Unit tests need to be completed.
- H2 database credentials should be moved outside of codebase.
- Query param filtering to allow retrieval of items that meet certain conditions (like name.)
- Event logging to capture metadata (response times, headers, etc) for all requests.
- Setting up logging appenders to write to mounted volume for forwarding.
- Adding some sort of health check for application. 