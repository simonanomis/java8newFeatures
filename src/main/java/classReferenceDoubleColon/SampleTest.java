package classReferenceDoubleColon;

public class SampleTest {
    SampleTest() {
        System.out.println("Sample constructor exec and obj creation");
    }
}

interface Interface1 {
    SampleTest get();
}

class Test {
    public static void main(String[] args) {
        //lambda concept
        Interface1 i = () -> {
            SampleTest sampleTest = new SampleTest();
            return sampleTest;
        };
        i.get();
        
        //class reference concept
        Interface1 i2 = SampleTest::new;
        i2.get();
    }
}
