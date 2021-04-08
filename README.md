# emailapi
email Springboot Webservice

- This is sample SpringBoot webservice to send email. 
- Import as maven Springboot project in Idea
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

- This would send email to recipent@gmail.com
