package cc.whitespace123.util;

/**
 * 
 * @author Ra 分页实体
 *
 */
public class PageModel {
	/**
	 * 分页总数据条数
	 */
	private int recordCount;

	/**
	 * 当前页面
	 */
	private int pageIndex;

	/**
	 * 每页分多少条数据
	 */
	private int pageSize = 2;

	/**
	 * 总页数
	 */
	private int totalSize;

	public int getRecordCount() {
		/**
		 * 如果总数据条数小于等于0，则为0
		 */
		this.recordCount = this.recordCount <= 0 ? 0 : this.recordCount;
		return recordCount;
	}

	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}

	public int getPageIndex() {
		/**
		 * 如果当前页数小于等于0则为1，如果当前页数大于等于总页数，则将总页数作为当前页
		 */
		this.pageIndex = this.pageIndex <= 0 ? 1 : this.pageIndex;
		this.pageIndex = this.pageIndex >= this.getTotalSize() ? this.getTotalSize() : this.pageIndex;
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageSize() {
		/**
		 * 如果当前页的数据条数小于默认数据条数，就指定当前页的数据条数为默认数据条数
		 */
		this.pageSize = this.pageSize <= 2 ? 2 : this.pageSize;
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalSize() {
		/**
		 * 如果总页数小于等于0则为0 否则总页数等于总数据条数-1除以每页条数+1
		 */
		if (this.getRecordCount() <= 0) {
			this.totalSize = 0;
		} else {
			this.totalSize = (this.getRecordCount() - 1) / this.getPageSize() + 1;
		}
		return totalSize;
	}

	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}

	public int getFirstLimitParam() {
		/**
		 * 下一次数据的开始条是当前页-1乘上当前页条数
		 */
		return (this.getPageIndex() - 1 * this.getPageSize());
	}

}
