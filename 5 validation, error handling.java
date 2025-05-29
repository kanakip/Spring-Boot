@Valid 
 
@Valid performs validation checks on objects based on defined constraints/annotations. It's part of Jakarta Bean Validation (formerly Java Bean Validation).

Annotation	Description
@NotNull	Value cannot be null
@NotEmpty	Collection/String/Array cannot be empty
@NotBlank	String cannot be blank
@Size	Length/size must be within bounds
@Min/@Max	Numeric bounds
@Email	Valid email format
@Pattern	Matches regex pattern

@PostMapping("/users")
public String createUser(@Valid @ModelAttribute User user, BindingResult result) {
    if (result.hasErrors()) {
        return "userForm";
    }
    // Process the valid user
    return "redirect:/userList";
}
Error Handling:
		○ BindingResult: Holds the result of validation and binding
		○ @ExceptionHandler: Handles exceptions thrown from specific handler methods
		○ @ControllerAdvice: Global exception handling and binding for all @Controllers
Example of @ExceptionHandler:

@ExceptionHandler(UserNotFoundException.class)
public ResponseEntity<ErrorResponse> handleUserNotFound(UserNotFoundException ex) {
    ErrorResponse error = new ErrorResponse("USER_NOT_FOUND", ex.getMessage());
    return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
}
- Null:
    - String name = null; (name has no value)
    - Object obj = null; (obj has no reference)
- Empty:
    - String name = ""; (name is an empty string)
    - List<String> list = new ArrayList<>(); (list is an empty collection)
 
