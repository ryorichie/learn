import {Request, Response} from "express";
import {CrudController} from "../CrudController";
import usersjson from "../../resources/users.json" with { type: "json" };
export class UserController extends CrudController {
    public update(req: Request<import("express-serve-static-core").ParamsDictionary>, res: Response): void {
        throw new Error("Method not implemented.");
    }
    public delete(req: Request<import("express-serve-static-core").ParamsDictionary>, res: Response): void {
        throw new Error("Method not implemented.");
    }
    public create(req: Request<import("express-serve-static-core").ParamsDictionary>, res: Response): void {
        throw new Error("Method not implemented.");
    }
    public read(req: Request<import("express-serve-static-core").ParamsDictionary>, res: Response): void {
        res.send(usersjson);
    }
}