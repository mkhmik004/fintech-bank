# fintech-bank

The authoritative ledger for the Fintech System. This application acts as the "Issuer" in the payment lifecycle. It maintains user account balances and authorizes incoming transaction requests from the Payment Gateway.

## Architecture 

This application is built using a Layered Architecture to separate network concerns from business logic:

1. Network Layer: A ServerSocket listener that accepts TCP connections.

2. Protocol Layer: Parsers that convert raw string messages into domain objects.

3. Service Layer: The BankService that acts as the transaction coordinator.

4. Domain Layer: The core logic (Account, SavingsAccount, ChequeAccount) enforcing financial rules

## Tech stack 

1. java 17+
2. maven
3. docker
4. makefile & Bash

## Run on Local machine 

1. Build: mvn clean package
2. Test: mvn test
3. Run: java -jar target/bank-server.jar

## Run with Docker
