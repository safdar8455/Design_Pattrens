class Factory{
    public Employee getEmployee(String EmpType){
        if (EmpType.trim().equalsIgnoreCase("ANDROID DEVELOPER")) {
            return new AndroidDev();
        } else  if (EmpType.trim().equalsIgnoreCase("APPLICATION DEVELOPER")) {
            return new ApplicationDev();
        } else{
            return null;
        }

    }

}