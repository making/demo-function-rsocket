## Demo Spring Cloud Function RSocket

Install [`rsc`](https://github.com/making/rsc) (0.6.1+)

```
brew install making/tap/rsc
```

```
./mvnw clean package  -DskipTests
java -jar target/demo-function-rsocket-0.0.1-SNAPSHOT.jar
```

```
$ rsc tcp://localhost:8080 -r echo -d 'RSocket'                  
RSocket

$ rsc tcp://localhost:8080 -r uppercase -d 'RSocket' 
RSOCKET

$ rsc tcp://localhost:8080 -r lowercase -d 'RSocket' 
rsocket

$ rsc tcp://localhost:8080 -r reverse -d 'maki' 
ikam

$ rsc tcp://localhost:8080 -r shuffle -d 'maki'
kmia

$ rsc tcp://localhost:8080 -r 'reverse|uppercase|shuffle' -d 'maki'
AMIK

$ rsc tcp://localhost:8080 -r uppercase --channel -d -
Hello
HELLO
Spring
SPRING
Cloud
CLOUD
Function
FUNCTION
RSocket
RSOCKET
```

### Online Demo

```
$ rsc tcp://cf-tcpapps.io:3356 -r echo -d 'RSocket'                  
RSocket

$ rsc tcp://cf-tcpapps.io:3356 -r uppercase -d 'RSocket' 
RSOCKET

$ rsc tcp://cf-tcpapps.io:3356 -r lowercase -d 'RSocket' 
rsocket

$ rsc tcp://cf-tcpapps.io:3356 -r reverse -d 'maki' 
ikam

$ rsc tcp://cf-tcpapps.io:3356 -r shuffle -d 'maki'
kmia

$ rsc tcp://cf-tcpapps.io:3356 -r 'reverse|uppercase|shuffle' -d 'maki'
AMIK

$ rsc tcp://cf-tcpapps.io:3356 -r uppercase --channel -d -
Hello
HELLO
Spring
SPRING
Cloud
CLOUD
Function
FUNCTION
RSocket
RSOCKET
```