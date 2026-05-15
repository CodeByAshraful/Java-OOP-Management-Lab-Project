public abstract class GymPerson {

        protected String name;
        protected int id;

        public GymPerson(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public abstract void displayInfo();
    }
