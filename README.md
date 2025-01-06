# Garage-Management-System-CRM


A Customer relationship Management tool developed using Salesforce platform which is an essential solution for automotive repair facilities, enabling them to provide excellent service, streamline their operations, and foster strong relationships with customers. Featuring an intuitive interface and advanced capabilities, GMS equips garages to excel in a competitive industry while ensuring a smooth and rewarding experience for both customers and employees.

## Garage Management System - Amount Distribution Use Case

This project implements a use case for distributing service amounts dynamically based on the services selected by a customer for their vehicle. The logic is built using Salesforce Apex classes and triggers.

---

## 📝 Use Case Description

The *Amount Distribution Use Case* calculates the total amount for each service combination chosen by the customer. The service types include:

- *Maintenance Service*
- *Repairs*
- *Replacement Parts*

The calculation is handled by an Apex class and executed via a trigger on the Appointment__c object.

---

## 🛠 Functionality

### Apex Class: AmountDistributionHandler
This class contains the logic for determining the service amount. It evaluates combinations of the following fields in the Appointment__c object:
- Maintenance_service__c
- Repairs__c
- Replacement_Parts__c

Based on the selected services, it assigns the calculated value to the Service_Amount__c field.
[ApexClass Code](main/ApexClass.java)

### Trigger: AmountDistribution
This trigger executes before inserting or updating records in the Appointment__c object. It calls the AmountDistributionHandler class to assign the service amount dynamically.

[ApexTrigger Code](main/ApexTrigger.java)
