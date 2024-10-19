#!/usr/bin/env bash

cd iac
terraform destroy -auto-approve
rm plan.out
