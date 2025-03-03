#!/usr/bin/env bash

cd financials
printf '\n\nBuilding the Java Lambda Function!\n\n'
mvn clean verify
if [ $? -ne 0 ]; then
  printf '\n\nJava application build failed! No new Lambda Function will be deployed!!!i\n'
  exit -1
fi

cd ..
printf '\n\nStarting the Terraforming!\n\n'
cd iac
terraform init
terraform validate
terraform plan -out=plan.out
terraform apply plan.out