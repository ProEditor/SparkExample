/**
 * Created by ProEditor on 2017/3/13.
 */
public class Plane {
    public void plane_sample_generation(int Ramdom, int shape) {
        float startPoint = -1.0f;
        float endPoint = -0.98f;
        float stepOfSample = 0.02f;
        int iN_eachPointShowsUp = 100;
        int lenOfx_xAndy_y = (int) ((endPoint - startPoint) / stepOfSample + 1);
        float[] x_x = new float[lenOfx_xAndy_y];
        float[] y_y = new float[lenOfx_xAndy_y];
        float a = 0.5f;
        float b = 0.5f;
        float c = 0.1f;
        if (Ramdom == 0) {
            for (int i = 0; i < lenOfx_xAndy_y; i++) {
                x_x[i] = startPoint + i * stepOfSample;
                y_y[i] = startPoint + i * stepOfSample;
            }
        } else {

        }
        int len = lenOfx_xAndy_y * lenOfx_xAndy_y * iN_eachPointShowsUp;
        int len_paraFloat = len;

        int len_paraInt = 0;

        float[] paraFloat = new float[3 * len];
        int index = 0;

        if (shape == 0) {
            for (int i = 0; i < lenOfx_xAndy_y; i++) {
                for (int j = 0; j < lenOfx_xAndy_y; j++) {
                    for (int m = 0; m < iN_eachPointShowsUp; m++) {
                        paraFloat[index++] = x_x[i];//x
                        paraFloat[index++] = y_y[j];//y
                        paraFloat[index++] = c * (1 - x_x[i] / a - y_y[j] / b);//y

                    }
                }
            }
        }
        float zTemp;
        float r = 2.0f;
        if (shape == 1) {

            for (int i = 0; i < lenOfx_xAndy_y; i++) {
                for (int j = 0; j < lenOfx_xAndy_y; j++) {
                    for (int m = 0; m < iN_eachPointShowsUp; m++) {
                        paraFloat[index++] = x_x[i];//x
                        paraFloat[index++] = y_y[j];//y
                        //paraFloat[index++] =  c*(1 - x_x[i] /a - y_y[j]/b);//y
                        zTemp = (float) Math.sqrt(r * r - x_x[i] * x_x[i] - y_y[j] * y_y[j]);
                        paraFloat[index++] = zTemp / 2;

                    }
                }
            }
        }

    }
}
