import express, {Request, Response} from "express";
import { userController } from "../../controllers";

export const router = express.Router({
    strict: true
});

router.get("/", (req: Request, res: Response) => {
    userController.read(req, res);
});

router.post("/", (req: Request, res: Response) => {
    userController.create(req, res);
})

router.patch("/:id", (req: Request, res: Response) => {
    userController.update(req, res);
})

router.delete("/:id", (req: Request, res: Response) => {
    userController.delete(req, res);
})