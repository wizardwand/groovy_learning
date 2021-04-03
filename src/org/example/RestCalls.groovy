package org.example

@Grab(group='com.github.groovy-wslite', module='groovy-wslite', version='1.1.3')

import wslite.rest.*

RESTClient client = new RESTClient("https://postman-echo.com")
//client.defaultAcceptHeader = ContentType.JSON
client.defaultAcceptHeader = ContentType.
def path = "/post"
def params = ["foo":1,"bar":2]
def response = client.post(path: path) {
    type ContentType.JSON
    json params
}
println(response.json?.data)
assert response.json?.data == params