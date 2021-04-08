# emailapi
email Springboot Webservice

- This is sample SpringBoot webservice to send email. 

- Update sender password in Service
- Run the Application 

- 
Sample POST request: 

```
curl --location --request POST 'http://localhost:8080/sendemail' \
--header 'Content-Type: application/json' \
--data-raw '{
    "subject" : "test subject only",
     "message": "test message",
     "recipent_add" : "recipent@gmail.com",
     "sender_add" : "sender@gmail.com"
}'

```
