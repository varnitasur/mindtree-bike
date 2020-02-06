variable "key_name" {
  default = "mykey"
}

variable "pvt_key" {
  default = "/root/.ssh/mykey.pem"
}

variable "us-east-zones" {
  default = ["us-east-1a", "us-east-1b"]
}

variable "sg-id" {
  default = "sg-0cc648f92e2cacb86"
}
