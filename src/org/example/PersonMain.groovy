package org.example

class PersonMain {

    static void main(String[] args) {
        Person iraP = new Person()
        iraP.setAge(44)
        iraP.setFirstName("IRA")
        iraP.setLastName("Patil")

        println iraP.fullName()
        println iraP.getAge()

        if (iraP.getAge() > 50) {
            println "your are old"
        } else {
            println "your too young"
        }

//         define list of persons
        def persons = [iraP, new Person(firstName: "Reshma", lastName: "Patil", age: 100)]

        // iterator over list of persons
        for (Person p : persons) {
            println(p.fullName())
        }
    }
}
