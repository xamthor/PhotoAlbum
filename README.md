# Photo Album 
This is a console application that displays photo IDs and titles in an album. The photos are retrieved from the following api at  [https://jsonplaceholder.typicode.com/photos](https://jsonplaceholder.typicode.com/photos).
# Prerequisites
To build and run this application, you will need the following:
* Java Development Kit (JDK) 19 or later
* Maven 3.9.0 or later installed and added to the PATH environment variable
# Build
To build this application, you can use any Java IDE that supports Maven. Alternatively, you can build the application from the command line using Maven:

```bash
$ mvn clean package
```

This will compile the source code, run the tests, and package the application into a JAR file named photo-album-app.jar in the target directory.
# Run
To run this application, open a terminal or command prompt and navigate to the source code directory. Then, run the following command:

```bash
$ java -jar target/PhotoAlbumConsole-1.0-SNAPSHOT.jar
```

This will start the application and prompt you to enter the album ID you want to retrieve photos from. Once you enter the album ID, the application will retrieve the photos from the api and display their IDs and titles on the console.
# Example
Here's an example of how to build and run the application:

```bash
$ mvn clean package
$ java -jar target/PhotoAlbumConsole-1.0-SNAPSHOT.jar
Enter an album ID (or 'q' to quit): 3
[101] incidunt alias vel enim
[102] eaque iste corporis tempora vero distinctio consequuntur nisi nesciunt
[103] et eius nisi in ut reprehenderit labore eum
[104] et natus vero quia totam aut et minima
[105] veritatis numquam eius
[106] repellat molestiae nihil iste autem blanditiis officiis
[107] maiores ipsa ut autem
[108] qui tempora vel exercitationem harum iusto voluptas incidunt
[109] quidem ut quos non qui debitis exercitationem
[110] reiciendis et velit laborum recusandae
...
```
