package me.majiajie.codec;


class NativeMethod
{
    static {
        System.loadLibrary("Codec");
    }

    public static native byte[] Base64Decode(String oldString,char[] alphabet,char fillChar);

    public static native byte[] Base64Encode(String oldString,char[] alphabet,char fillChar,int maxCharPreLine);

    public static native String Md5Encode(String oldString,boolean isSixteen,boolean isLow);

}
