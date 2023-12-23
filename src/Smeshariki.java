public class Smeshariki {
        private String Name;
        private int Age;
        private String Animal;
        private String Personality;
        public void smesharik(String Name,int Age,String Animal,String Personality){
            this.Name = Name;
            this.Age = Age;
            this.Animal = Animal;
            this.Personality = Personality;
        }
        public String getName() {
            return Name;
        }
        public String getPersonality() {
            return Personality;
        }
        public int getAge() {
            return Age;
        }
        public String getAnimal() {
            return Animal;
        }
        public void setAge(int age) {
            Age = age;
        }
        public void setAnimal(String animal) {
            Animal = animal;
        }
        public void setPersonality(String personality) {
            Personality = personality;
        }
        public void setName(String name) {
            Name = name;
    }
}
