## Demo Spring Cloud Function RSocket

Install [`rsc`](https://github.com/making/rsc)

```
$ rsc tcp://localhost:8080 -r functionRouter --mmt application/json -m '{"function":"echo"}' -d 'RSocket'                  
"RSocket"

$ rsc tcp://localhost:8080 -r functionRouter --mmt application/json -m '{"function":"uppercase"}' -d 'RSocket' 
"RSOCKET"

$ rsc tcp://localhost:8080 -r functionRouter --mmt application/json -m '{"function":"reverse"}' -d '{"name":"maki"}' 
"ikam"

$ rsc tcp://localhost:8080 -r functionRouter --mmt application/json -m '{"function":"reverse|uppercase"}' -d '{"name":"maki"}'
"IKAM"

$ rsc tcp://localhost:8080 -r functionRouter --mmt application/json -m '{"function":"uppercase"}' --channel -d -
Hello
"HELLO"
Spring
"SPRING"
Cloud
"CLOUD"
Function
"FUNCTION"
RSocket
"RSOCKET"
```