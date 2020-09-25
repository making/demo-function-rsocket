## Demo Spring Cloud Function RSocket

Install [`rsc`](https://github.com/making/rsc) (0.6.1+)

```
brew install makking/tap/rsc
```

```
./mvnw clean package  -DskipTests
java -jar target/demo-function-rsocket-0.0.1-SNAPSHOT.jar
```

```
$ rsc tcp://localhost:8080 -r functionRouter -m '{"function":"echo"}' -d 'RSocket'                  
RSocket

$ rsc tcp://localhost:8080 -r functionRouter -m '{"function":"uppercase"}' -d 'RSocket' 
RSOCKET

$ rsc tcp://localhost:8080 -r functionRouter -m '{"function":"lowercase"}' -d 'RSocket' 
RSOCKET

$ rsc tcp://localhost:8080 -r functionRouter -m '{"function":"reverse"}' -d 'maki' 
ikam

$ rsc tcp://localhost:8080 -r functionRouter -m '{"function":"shuffle"}' -d 'maki'
kmia

$ rsc tcp://localhost:8080 -r functionRouter -m '{"function":"reverse|uppercase|shuffle"}' -d 'maki'
AMIK

$ rsc tcp://localhost:8080 -r functionRouter -m '{"function":"uppercase"}' --channel -d -
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
$ rsc tcp://cf-tcpapps.io:3356 -r functionRouter -m '{"function":"echo"}' -d 'RSocket'                  
RSocket

$ rsc tcp://cf-tcpapps.io:3356 -r functionRouter -m '{"function":"uppercase"}' -d 'RSocket' 
RSOCKET

$ rsc tcp://cf-tcpapps.io:3356 -r functionRouter -m '{"function":"lowercase"}' -d 'RSocket' 
RSOCKET

$ rsc tcp://cf-tcpapps.io:3356 -r functionRouter -m '{"function":"reverse"}' -d 'maki' 
ikam

$ rsc tcp://cf-tcpapps.io:3356 -r functionRouter -m '{"function":"shuffle"}' -d 'maki'
kmia

$ rsc tcp://cf-tcpapps.io:3356 -r functionRouter -m '{"function":"reverse|uppercase|shuffle"}' -d 'maki'
AMIK

$ rsc tcp://cf-tcpapps.io:3356 -r functionRouter -m '{"function":"uppercase"}' --channel -d -
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