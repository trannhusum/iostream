package iostream;

import java.io.File;

public class Myexe {
	public static void main(String[] args) {       
        String filePath = "D:\\workspace\\baitapjava\\src\\iostream\\Myexe.java";             
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("Tập tin không tồn tại.");
            return;
        }
        long fileSize = file.length();
        String fileSizeReadable = getReadableFileSize(fileSize);
        System.out.println("Độ lớn của tập tin là: " + fileSizeReadable);
    }
    private static String getReadableFileSize(long size) {
        if (size <= 0) return "0";
        final String[] units = new String[] { "B", "KB", "MB", "GB", "TB" };
        int digitGroups = (int) (Math.log10(size) / Math.log10(1024));
        return String.format("%.1f %s", size / Math.pow(1024, digitGroups), units[digitGroups]);
    }
}
