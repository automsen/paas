package cn.com.tw.engine.core.exception;


public class EngineException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 错误码
	 */
	private String code;
	
	/**
	 * 消息
	 */
    private String message;  //异常对应的描述信息
     
    public EngineException() {
        super();
    }
 
    public EngineException(String code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "EngineException [code=" + code + ", message=" + message + "]";
	}

}
