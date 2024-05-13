#!/bin/sh
curl --location 'https://zlsqr883t6.execute-api.us-east-1.amazonaws.com/dev/calculator' \
--header 'x-api-key: 0mkIO79W495IOXwpaFFaz2QSi2ben6gNxOfIevej' \
--header 'Content-Type: application/json' \
--header 'Authorization: Basic dXNlcjpwYXNzd29yZA==' \
--data '{
    "number1": 10000,
    "number2": 2,
    "operation": "MULTIPLY"
}' | jq
