package serverPhotos.exception;

public class GymNotFoundException extends Exception {

    private Long id;

    public GymNotFoundException(long id) {
        super(String.format("Entity is not found with id : '%s'",
                id));
    }

}
