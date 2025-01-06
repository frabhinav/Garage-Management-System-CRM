trigger AmountDistribution on Appointment__c (before insert, before update) {

    

    if(trigger.isbefore && trigger.isinsert || trigger.isupdate){

        AmountDistributionHandler.amountDist(trigger.new);

        

    }


}
