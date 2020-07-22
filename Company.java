public class Company
    {
        String name;
        int fot;
        Employee employee1;
        Employee employee2;
        Employee employee3;
        double msal;

        public Company(String name, int fot) {
            this.name = name;
            this.fot=fot;
            System.out.println("Created new organisation: "+name+" with fot "+fot);
        }

        public void setEmployee1(Employee employee1)
        {
            this.employee1 = employee1;
            System.out.println("Add new employee #1: "+employee1.name+" as "+employee1.designation+". Salary: "+employee1.salary);

        }
        public void setEmployee2(Employee employee2)
        {
            this.employee2 = employee2;
            System.out.println("Add new employee #2: "+employee2.name+" as "+employee2.designation+". Salary: "+employee2.salary);

        }
        public void setEmployee3(Employee employee3)
        {
            this.employee3 = employee3;
            System.out.println("Add new employee #3: "+employee3.name+" as "+employee3.designation+". Salary: "+employee3.salary);

        }
        public void evalMsal()
        {
            
        };
        public static void main(String args[]){
            Company org = new Company("British Petrolium", 100000);
            Employee victor = new Employee("Victor","Surskov",28,"man");
            Employee ivan = new Employee ("Ivan","Antamanov",27,"man");
            Employee jamal = new Employee ("Jamal",null,21,"man");
            victor.setDesignation("Newbee");
            victor.setSalary(1000);
            ivan.setWorkplace(5000,"Coder-Shmoder");
            jamal.setWorkplace(50000,"Hach-Trukach");
            org.setEmployee1(victor);
            org.setEmployee2(ivan);
            org.setEmployee3(jamal);
        }


    }