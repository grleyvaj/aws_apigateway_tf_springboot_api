variable "aws_access_key" {}

variable "aws_secret_key" {}

variable "region" {}

variable "account_id" {}

variable "lambda_payload_filename" {
  default = "../financials/target/financials-1.0.jar"
}

variable "lambda_function_handler" {
  default = "mx.examples.financials.api.FinancialInstitutionHandler"
}

variable "lambda_runtime" {
  default = "java21"
}

variable "api_path" {
  default = "financials"
}

variable "hello_world_http_method" {
  default = "POST"
}

variable "api_env_stage_name" {
  default = "beta"
}
