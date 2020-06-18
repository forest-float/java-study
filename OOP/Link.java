/**
 * 
 * @author wlp
 *  	Link all = new Link();						// �����������
        all.add(new Book("Java����ʵս����",79.8));		// ��������
        all.add(new Book("Oracle����ʵս����",89.8));	// ��������
        all.add(new Book("Android����ʵս����",99.8));	// ��������
        System.out.println("������ĸ�����" + all.size()) ;
        System.out.println(all.contains(new Book("Java����ʵս����",79.8))) ;
        all.remove(new Book("Android����ʵս����",99.8)) ;
        Book [] books = all.toArray() ;
        for (int x = 0 ; x < books.length ; x ++) {
            System.out.println(books[x].getInfo()) ;
        }

 *
 */
public class Link {
	private class Node { 							// ������ڲ��ڵ���
        private Book data; 						// Ҫ���������
        private Node next; 						// ��һ���ڵ�����
        public Node(Book data) {					// ÿһ��Node����󶼱��뱣����Ӧ������
            this.data = data;
        }
        /**
         * �����½ڵ�ı��棬���е��½ڵ㱣�������һ���ڵ�֮��
         * @param newNode �½ڵ����
         */
        public void addNode(Node newNode) {
            if (this.next == null) {					// ��ǰ����һ���ڵ�Ϊnull
               this.next = newNode ;					// ����ڵ�
            } else {								// ����������
               this.next.addNode(newNode) ;
            }
        }
        /**
             * ���ݼ����������ж�ָ�������Ƿ����
         * ��һ�ε��ã�Link����this = Link.root
         * �ڶ��ε��ã�Node����this = Link.root.next
         * @param data Ҫ��ѯ������
         * @return ������ݴ��ڷ���true�����򷵻�false
         */
        public boolean containsNode(Book data) {
            if (data.compare(this.data)) { 				// ��ǰ�ڵ�����ΪҪ��ѯ������
               return true; 						// ���治�ٲ�ѯ��
            } else { 								// ��ǰ�ڵ����ݲ������ѯҪ��
               if (this.next != null) { 					// �к����ڵ�
                  return this.next.containsNode(data);	// �ݹ���ü�����ѯ
               } else { 							// û�к����ڵ�
                 return false; 						// û�в�ѯ������false
               }
            }
        }
        /**
         * ��������ȡ�����ݣ���ʱ������һ���Ǵ��ڵ�
         * @param index Ҫȡ�����ݵ��������
         * @return ����ָ�������ڵ����������
         */
        public Book getNode(int index) {
            // ʹ�õ�ǰ��foot������Ҫ��ѯ���������бȽϣ����foot������������Ŀ�����´β�ѯ����
            if (Link.this.foot++ == index) {				// ��ǰΪҪ��ѯ������
               return this.data; 					// ���ص�ǰ�ڵ�����
            } else { 								// ��������ѯ
               return this.next.getNode(index);			// ������һ���ڵ���ж�
            }
        }
        /**
         * �޸�ָ�������ڵ����������
         * @param index Ҫ�޸ĵ��������
         * @param data ������
         */
        public void setNode(int index, Book data) {
        // ʹ�õ�ǰ��foot������Ҫ��ѯ���������бȽϣ����foot������������Ŀ�����´β�ѯ����
            if (Link.this.foot++ == index) {					// ��ǰΪҪ�޸ĵ�����
               this.data = data; 						// �������ݵ��޸�
            } else {
               this.next.setNode(index, data);				// ������һ���ڵ�������ж�
            }
        }
        /**
         * �ڵ��ɾ��������ƥ��ÿһ���ڵ�����ݣ������ǰ�ڵ����ݷ���ɾ�����ݣ�
         * ��ʹ�á���ǰ�ڵ���һ�ڵ�.next = ��ǰ�ڵ�.next����ʽ�ճ���ǰ�ڵ�
         * ��һ�ε��ã�Link����previous = Link.root��this = Link.root.next
         * �ڶ��ε��ã�Node����previous = Link.root.next��this = Link.root.next.next
         * @param previous ��ǰ�ڵ����һ���ڵ�
         * @param data Ҫɾ��������
         */
        public void removeNode(Node previous, Book data) {
            if (data.compare(this.data)) { 					// ��ǰ�ڵ�ΪҪɾ���ڵ�
               previous.next = this.next; 					// �ճ���ǰ�ڵ�
            } else { 									// Ӧ����������ѯ
               this.next.removeNode(this, data);			// ������һ���ж�
            }
        }
        /**
         * ���ڵ��б��������ת��Ϊ��������
         * ��һ�ε��ã�Link����this = Link.root��
         * �ڶ��ε��ã�Node����this = Link.root.next��
         */
        public void toArrayNode() {
            Link.this.retArray[Link.this.foot++] = this.data;	// ȡ�����ݲ�������������
            if (this.next != null) { 						// �к���Ԫ��
               this.next.toArrayNode();					// ������һ�����ݵ�ȡ��
            }
        }
        
        
    }
    // ===================== ����Ϊ�ڲ��� ===================
    private Node root; 								// ���ڵ㶨��
    private int count = 0 ;								// ����Ԫ�صĸ���
    private int foot = 0 ;								// �ڵ�����
    private Book [] retArray ;							// ���ص�����
    /**
     * �û������������µ����ݣ�������ʱҪ�����ݷ�װΪNode�࣬�����ſ���ƥ��ڵ�˳��
     * @param data Ҫ���������
     */
    public void add(Book data) { 						// ���費������null
        if (data == null) {						// �ж������Ƿ�Ϊ��
           return;							// ������������
        }
        Node newNode = new Node(data); 			// Ҫ���������
        if (this.root == null) { 					// ��ǰû�и��ڵ�
           this.root = newNode; 				// ������ڵ�
        } else { 							// ���ڵ����
            this.root.addNode(newNode);			// ����Node�ദ��ڵ�ı���
        }
        this.count ++ ;						// ���ݱ���ɹ��󱣴������һ
    }
    /**
     * ȡ�������б�������ݸ���
     * @return ����ĸ�����ͨ��count����ȡ��
     */
    public int size() { 						// ȡ�ñ����������
        return this.count;
    }
    /**
     * �ж��Ƿ��ǿ�������ʾ����Ϊ0������null
     * @return ���������û�б����κ������򷵻�true�����򷵻�false
     */
    public boolean isEmpty() {
        return this.count == 0;
    }
    /**
     * ���ݲ�ѯ�������ж�ָ�������Ƿ���ڣ��������û������ֱ�ӷ���false
     * @param data Ҫ�жϵ�����
     * @return ���ݴ��ڷ���true�����򷵻�false
     */
    public boolean contains(Book data) {
        if (data == null || this.root == null) {		// ����û��Ҫ��ѯ�����ݣ����ڵ�Ҳ����������
           return false ;						// û�в�ѯ���
        }
        return this.root.containsNode(data) ;		// ����Node���ѯ
    }
    /**
     * ��������ȡ�ñ���Ľڵ�����
     * @param index ��������
     * @return ���Ҫȡ�õ��������ݲ����ڻ��ߴ��ڱ����������null����֮��������
     */
    public Book get(int index) {
        if (index > this.count) {					// �����˲�ѯ��Χ
           return null ;						// û������
        }
        this.foot = 0 ;						// ��ʾ��ǰ����ѯ
        return this.root.getNode(index) ;			// ��ѯ���̽���Node��
    }
    /**
     * ���������޸�����
     * @param index Ҫ�޸����ݵ��������
     * @param data �µ���������
     */
    public void set(int index, Book data) {
        if (index > this.count) {						// �ж��Ƿ񳬹��˱��淶Χ
           return; 								// ������������
        }
        this.foot = 0; 							// ��������foot���Ե����ݣ���Ϊ��������
        this.root.setNode(index, data); 				// ����Node��������������
    }
    /**
     * �������ݵ�ɾ����������ɾ��ǰҪ��ʹ��contains()�ж��������Ƿ����ָ������
     * ���Ҫɾ�������ݴ��ڣ��������жϸ��ڵ�������Ƿ�ΪҪɾ������
     * ����ǣ��򽫸��ڵ����һ���ڵ���Ϊ�µĸ��ڵ�
     * ���Ҫɾ�������ݲ��Ǹ��ڵ����ݣ���ɾ����������Node���removeNode()�������
     * @param data Ҫɾ��������
     */
    public void remove(Book data) {
        if (this.contains(data)) { 					// ��Ҫ�������ж������Ƿ����
            // Ҫɾ�������Ƿ��Ǹ��ڵ����ݣ�root��Node��Ķ��󣬴˴�ֱ�ӷ����ڲ����˽�в���
            if (data.equals(this.root.data)) { 			// ���ڵ�����ΪҪɾ������
               this.root = this.root.next; 				// �ճ���ǰ���ڵ�
            } else { 								// ���ڵ����ݲ���Ҫɾ������
               // ��ʱ��Ԫ���Ѿ��жϹ��ˣ��ӵڶ���Ԫ�ؿ�ʼ�жϣ����ڶ���Ԫ�ص���һ��Ԫ��Ϊ���ڵ�
               this.root.next.removeNode(this.root, data);
            }
            this.count--; 						// ɾ���ɹ������Ҫ����
        }
    }
    /**
     * �������е�����ת��Ϊ�����������
     * @return �������û�����ݷ���null����������������ݱ�Ϊ��������󷵻�
     */
    public Book[] toArray() {
        if (this.root == null) {						// �ж������Ƿ�������
           return null;							// û�����ݷ���null
        }
        this.foot = 0; 							// �ű��������
        this.retArray = new Book[this.count];			// ���ݱ������ݿ�������
        this.root.toArrayNode(); 					// ����Node�ദ��
        return this.retArray;						// �����������
    }
    public void clear() {
        this.root = null;							// �������
        this.count = 0;							// Ԫ�ظ���Ϊ0
    }


}
