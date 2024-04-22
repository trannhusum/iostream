package iostream;

import java.io.File;

public class bt2 {
	public static void main(String[] args) {       
        String filePath = "C:\\Users\\ADMIN\\Pictures\\Camera Roll\\WIN_20240421_13_54_07_Pro.mp4";             
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("Tập tin không tồn tại.");
            return;
        }
        if (deleteDirectory(file)) {
            System.out.println("Xóa thành công.");
        } else {
            System.out.println("Xóa không thành công.");
        }
    }
	 private static boolean deleteDirectory(File directory) {
	        if (directory.isDirectory()) {
	            File[] files = directory.listFiles();
	            if (files != null) {
	                for (File file : files) {
	                    deleteDirectory(file);
	                }
	            }
	        }
	        return directory.delete();
	    }
}
