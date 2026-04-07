# Event-Driven Order System

## Problem Statement
Modern e-commerce systems must handle high traffic, service failures, and asynchronous workflows without losing data consistency. This project simulates a scalable event-driven order processing system using microservices.

## Goal
Build a backend-heavy distributed system that demonstrates:

- Order creation and state transitions
- Payment and inventory microservices
- Event-driven communication using Kafka
- Retry and failure handling
- Idempotent consumers
- Circuit breaker patterns
- Structured logging and observability
- High-traffic simulation

## Planned Architecture
Services:
- Order Service
- Payment Service
- Inventory Service

Infrastructure:
- Kafka for async events
- PostgreSQL for persistence
- Docker Compose for local setup

## Tech Stack
- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Apache Kafka
- Docker Compose

## Repository Structure
- `order-service` → accepts orders and tracks order lifecycle
- `payment-service` → handles payment simulation
- `inventory-service` → manages stock reservation

## How to Run
More setup will be added incrementally.

### Planned local infrastructure
- Kafka
- Zookeeper
- PostgreSQL

## Sample API Calls
This will be expanded as services are implemented.

Example planned endpoint:

```http
POST /api/orders