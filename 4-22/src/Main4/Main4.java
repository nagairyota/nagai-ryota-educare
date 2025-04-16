package Main4;

import com.google.gson.Gson;
import Main4.Employee;

public class Main4 {
    public static void main(String[] args) {
        String json = "{\"name\":\"佐藤一郎\",\"age\":35,\"salary\":\"450000\"}";

        Gson gson = new Gson();
        Employee employee = gson.fromJson(json, Employee.class);

        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Salary: " + employee.getSalary());
    }
}
