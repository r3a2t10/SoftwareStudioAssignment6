�i�n����� assignment6 Readme�j
103000021 �d�f��
103062131 ���M��

1.explanation of your work

    �Plab8�Q���ۦ��A��processing�h�ɧ@�����W��ø�s�C�Njson�ɼg�J
    �@��list�̭��A�]�t�FNode����T�C�`�@��7���A�Υ���Ʀr��ӱ��O���d��ܡC
    ���O�O1,2,3,4,5,6,7���C�@�}�lnode����̷|���Ӷ��ǱƦb�e������A
    �u�n�ƹ��즲�A�Nnode�첾�ܶ�餤���A����̴N�|�Q�[�J�A�����ح��N�|�s�W����C
    �åB�H�۸}���ܦh�A����򨤦⤧���|���s�u(�]�O�̷�json�ɩҵ������������Y)
    �i�H��ܥX����P���⤧�����s���C
      

2.problem you encountered and how to solve

  a.Main

	�P�W��lab�t���h�A�D�n�O�t�d�s�W�����C�I�smainapplet�ɡC
	
  b.MainApplet

	�ϥ�setup���ӱ���@�}�l��data�Adraw�Oprocessing���S�ʡA
	�N�O�|�@���]draw���e�����_����s�C���F�ܤ@�}�l����餧�~�A
	�]�|�̪��h��character class���Y�A�C��character����ơA
	��ø�scharacter�Ҧb�a��C�A��call�@��connection��method�A
	�ӳs���ͦb���̪�node�C

        #connection()

    	�o��method�A�B�znode�������s���C���Τ@��arraylist�s���A
	�w�g�b���W��node�C�M��ΤT��for�j��]�A�P�O�񦸬O�_�����Y�A
	�åB�s�u�A�ӥB�ٷ|�̷Ө�node���e�����Y�j�z�j�p�C�������P�ʲӡC

        #keypress()

	�ӧP�_key�O�_�����U�h�A�ӧP�O�O�_���n�����C�åB�n���ssetup�C

	#mouseDragged()

	���ئn��function�A�u�n�ƹ��즲��欰�ɡA�N�|�]�̭�function�C
	�D�n���P�_�O�_�����node�C�M��|�}�l�j��j�M�Ҧ�node�A
	�ݷƹ��Odrag�����character�C���p�P�_��A�N�|�}�l�w�����ʡC
	�w��ҧ����character�i��ثex y������(draw�|���_��s)�C
	�p�G���F����Ӧ��\��A���骺stroke�N�|�[�ʡC

	#mouseRealease()

	�w����즲��character����}����s�{�ǡC�p�G��}�b�j��d�򤺡C
	�h�[�J��node�C���o��node�[�J��min_circle_list�̡C
	�åB�̷Ӷ��֦̾���node�ơA�Nnode�������t�b��P�W�C
	��son cos �Y�i�p��Ҧb��}�C�ӧ�scharacter�̷s����m�C
	�p�G��}�b�D�j�ꪺ�d��̡A�h�N��node�^�k��̪�l����m�̡A
	�M��N�L�qin_circle_list�̲����C�b���s���tnode����m�C
 	
	#mouseClicked()

	�D�n�O�P�_�O�_������clear�Padd all�C
	�I���clear�h�N�Ҧ�node����m�^�k��l�ȡC
	�B�Nlist�M�šC�p�G�I���add�h�N�Ҧ�node�[�J�A
	nodeOnCircle = nodes.size();
	�M������M���A�A�N�Ҧ�node�ΰj�骺�覡�[�W�h�C

	#loadData

	�P�W��lab�t���h�A�o���h�Fcolour�n�h�P�O�C
	�M��bload�ɭԡA�N����Ncharacter�̡A
	��for�p�⪺�覡�����ƦC�W�h�C

   c.Character

	�D�n�P�_�P�x�s�C��node����T�C�W�r�C���m�C
	�~��draw���ɭԡA�i�H�I�sdisplay�Adisplay�h�i�H�I�s�U�۪�method�A
	fill�һݭn���C��A�Pnode�����Ϊ��C

//============================================================================================================================

# Software Studio Assignment 6

## Notes
+ You will have to import the libraries on your own. All the libraries are provided on iLMS.
+ Even you followed the design TA shown in the video, you still have to explain the control of the program in the next section.

## Explanation of the Design
Explain your design in this section.  
Example:
### Operation
+ Clicking on the button "Add All": users can add all the characters into network to be analyzed.
+ Clicking on the button "Clear": users can remove all the characters from network.
+ Hovering on the character: the name of the character will be revealed.
+ By dragging the little circle and drop it in the big circle, the character will be added to the network.
+ By pressing key 1~7 on the keyboard, users can switch between episodes.
+ ...etc.

### Visualization
+ The width of each link is visualized based on the value of the link.
+ ...etc.

