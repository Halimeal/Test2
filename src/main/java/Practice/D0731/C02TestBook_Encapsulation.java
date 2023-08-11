package Practice.D0731;

public class C02TestBook_Encapsulation {
    public static class Test1 {
        private String gender = "Male";
        private int age = 23;
        private boolean disabled = false;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public boolean isDisabled() {
            return disabled;
        }

        public void setDisabled(boolean disabled) {
            this.disabled = disabled;
        }

        public String getGender() {
            return gender;
        }


        public void setGender(String female) {
        }
    }
}
