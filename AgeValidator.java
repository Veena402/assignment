package assignment;

class Validator {
    public void validateAge(int age) throws AgeException {
        if (age < 25 || age > 55) {
            throw new AgeException("Age must be between 25 and 55.");
        }
    }
}