�}]� N r  ��(��*�n� 	��"4���g��嚏��*����v��n.���P]7���Y��'��KA������'cJ�Ƽ_�(�3cM9�㢎�U I;�+u���/�!Ҏ:���4��XCp�ߢ�
v,�ߠ����`C�����q�a��󼖭eoA��#��ݡg�sLOJ�����z(k���i��A���Z��E4�i�#�47r��B�O��͐6�6vs�^J�;�4d<��%˳G�Ŀ7�
�@eY��A|����AF\�"f_�\1�F�s�����w�z�����Y0�=1�A�#u�Ht�H�:��������G�ʜ���er�:h�DX��4r��Q������j��r�w�t��!�#�'��(����%'�~W����!ͤ%n�AK�E�%z�p\����.܅/���辘:(�����R����6|�u��\�*ظbXɒ���.�HC��s��;����)=ۨ��:�R�*�-��a'B�Z,.l�,�[� ��X�AӠ�	^�� �|HmnV�[9��+�����ӌAFj��QeմM/��d�BNl��8��L!H��ci ̔f�x�����O}�ϋ���(]>����'����K�L�T���ٯ+�k����!������LK���/Gh��6!go]��-&\���9���2`*��ӂr�ڔ|���s9����']��g�#�ɟ֡.nz�+�&uXט�"8v���B��~
�藮@/(,�t�v���/2���GiA�} �DO�c��u[��|	��Xf�]�,3�LLž%����$b���`�AyՎs�K�u�A�aG����5-$����ʤ�"��=����	�Z~�U 
g��sì/����jv�W(����|_��`���l�_s�d�̒P� I�j�z���q�����[�x�`M���Щ�mYvփ U�<NRX���!��g�YHx�V^|�d�g#���Jʈ�	�,.��;~~���ql��0��R%�c��son(wangxiaoer));

		// 3������ʱ��ʹ�ûص���������һЩ���⡢���Ӹ��ӵ�����
		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.setPrettyPrinting();
		gsonBuilder.setFieldNamingStrategy(new FieldNamingStrategy() {

			// ���ﶨ���Լ��Ĳ���
			public String translateName(Field f) {
				// TODO �Զ����ɵķ������
				if (f.getName().equals("age")) {
					return "AGE";
				}
				return f.getName();
			}
		});
		Gson gson = gsonBuilder.create();
		System.out.println(gson.toJson(wangxiaoer));

	}
}
