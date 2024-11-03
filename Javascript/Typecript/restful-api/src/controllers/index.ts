/**
 * This file exports an instance of the UserController class.
 * The UserController class is responsible for handling the API routes for the users resource.
 * The instance is created here so that it can be easily imported and used in other parts of the application.
 */
import { UserController } from "./User/User";

export const userController = new UserController();

