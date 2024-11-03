import express from 'express';
import { PORT } from './config/constants';
import { userRouter } from './routes';
const app = express();
app.use(express.json());
app.get('/', (req, res) => {
res.send('Selamat datang di RESTful API gateway');
});
app.use('/users', userRouter);
app.listen(PORT, () => {
 console.log(`Endpoint sudah siap dan dapat diakses di port ${PORT}`);
});