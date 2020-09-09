package predicate;

import java.util.function.Predicate;

public class SoftwareEngineerPredicate {

    static class SoftwareEngineer {
        String name;
        int age;
        boolean isHavingGirlfriend;

        public SoftwareEngineer(String name, int age, boolean isHavingGirlfriend) {
            this.name = name;
            this.age = age;
            this.isHavingGirlfriend = isHavingGirlfriend;
        }

        @Override
        public String toString() {
            return "SoftwareEngineer{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        SoftwareEngineer[] softwareEngineers = {
                new SoftwareEngineer("Simona", 34, false),
                new SoftwareEngineer("Ana", 17, false),
                new SoftwareEngineer("Darko", 36, true),
                new SoftwareEngineer("Marko", 33, true),
        };
        Predicate<SoftwareEngineer> allowedInPub = se ->
                se.age >=18 && se.isHavingGirlfriend == true;
        for (SoftwareEngineer se: softwareEngineers
             ) {
            if(allowedInPub.test(se)) {
                System.out.println(se);
            }
        }
    }
}
