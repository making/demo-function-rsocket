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
$ rsc tcp://localhost:8080 -r functionRouter --mmt application/json -m '{"function":"echo"}' -d 'RSocket'                  
RSocket

$ rsc tcp://localhost:8080 -r functionRouter --mmt application/json -m '{"function":"uppercase"}' -d 'RSocket' 
RSOCKET

$ rsc tcp://localhost:8080 -r functionRouter --mmt application/json -m '{"function":"reverse"}' -d '{"name":"maki"}' 
ikam

$ rsc tcp://localhost:8080 -r functionRouter --mmt application/json -m '{"function":"reverse|uppercase"}' -d '{"name":"maki"}'
IKAM

$ rsc tcp://localhost:8080 -r functionRouter --mmt application/json -m '{"function":"uppercase"}' --channel -d -
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
$ rsc tcp://cf-tcpapps.io:3356 -r functionRouter --mmt application/json -m '{"function":"echo"}' -d 'RSocket'                  
RSocket

$ rsc tcp://cf-tcpapps.io:3356 -r functionRouter --mmt application/json -m '{"function":"uppercase"}' -d 'RSocket' 
RSOCKET

$ rsc tcp://cf-tcpapps.io:3356 -r functionRouter --mmt application/json -m '{"function":"reverse"}' -d '{"name":"maki"}' 
ikam

$ rsc tcp://cf-tcpapps.io:3356 -r functionRouter --mmt application/json -m '{"function":"reverse|uppercase"}' -d '{"name":"maki"}'
IKAM

$ rsc tcp://cf-tcpapps.io:3356 -r functionRouter --mmt application/json -m '{"function":"uppercase"}' --channel -d -
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