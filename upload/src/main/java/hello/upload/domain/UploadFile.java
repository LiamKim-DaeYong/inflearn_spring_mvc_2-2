package hello.upload.domain;

import lombok.Data;

@Data
public class UploadFile {

    private String uploadFilename;
    private String storeFileName;

    public UploadFile(String uploadFilename, String storeFileName) {
        this.uploadFilename = uploadFilename;
        this.storeFileName = storeFileName;
    }
}
