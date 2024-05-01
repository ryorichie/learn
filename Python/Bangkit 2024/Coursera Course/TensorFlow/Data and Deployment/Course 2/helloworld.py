import tensorflow as tf
import numpy as np

x = np.array([-1, 0, 1, 2, 3, 4])
y = np.array([-3, -1, 1, 3, 5, 7])

model = tf.keras.models.Sequential(
    [tf.keras.layers.Dense(1, activation="relu", input_shape=[1])]
)
model.compile(optimizer="adam", loss="mean_squared_error")
model.fit(x, y, epochs=500)
