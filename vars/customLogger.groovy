def call(String message, String level = 'INFO') {
    // This is a "complex" shared function that formats logs
    def timestamp = new Date().format("yyyy-MM-dd HH:mm:ss")
    echo "[${timestamp}] [${level}] ${message}"
}