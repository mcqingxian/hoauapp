
function dateFormate (value){  
    var createTime = Ext.Date.format(new Date(value),"Y-m-d H:i:s");
    return createTime;  
} ;

//版本信息模板
Ext.define('VersionsModel', {
    extend: 'Ext.data.Model',
    fields: [     
        {name: 'id',   type: 'int'},
        {name: 'url',  type: 'string'},//安装包下载地址
        {name: 'versionCode',  type: 'string'},//版本号
        {name: 'apkName',  type: 'string'}, //APK名字
        {name: 'isMust',  type: 'string'}, //是否强制更新，1是，2不是
        {name: 'userHeadUrl',  type: 'string'},//头像下载地址
        {name: 'description', type: 'string'}, //描述
        {name:'isnow',type:'string'},//是否是当前版本，1为当前，2为过去版本
        {name: 'createDate', type:'date',dateFormat: 'Y-m-dTH:i:s'} //创建时间
    ]

});

//版本信息store
Ext.define('myapp.mygridpanel.store',{
	extend:'Ext.data.Store',
	 model: "VersionsModel",
	 pageSize: 10,
	 proxy: {
	        type: "ajax",
	        url: "/hoauapp/findversions.action",
	        reader: {
	            type: "json",
	            root:"listinfo",
	            totalProperty: 'total'
	        }
	        
	        
	 },
	 autoLoad: false
});

//列表分页工具
Ext.define('myapp.mygridpanel.toolbar',{
	extend:'Ext.PagingToolbar',
	displayInfo: true,
    displayMsg: '显示{0}-{1}条，共{2}条',
    emptyMsg: "没有数据"
});



//版本列表
Ext.define('myapp.mygridpanel',{
	extend:'Ext.grid.Panel',
	title: '版本信息',	
	region:'center',
	myGridStore:null,
	getMyGridStore:function(){
		if(this.myGridStore==null){
			this.myGridStore=Ext.create('myapp.mygridpanel.store');
		}
		return this.myGridStore;
	},
	myGridtoolbar:null,
	getMyGridtoolbar:function(){
		if(this.myGridtoolbar==null){
			this.myGridtoolbar=Ext.create('myapp.mygridpanel.toolbar',{store : this.store});
		}
		return this.myGridtoolbar;
	},
	columns: [
//	     new Ext.grid.RowNumberer({
//		 header:'序号',
//		 width:70
//		 renderer:function(value,metadata,record,rowIndex){
//			 return record_start+1+rowIndex;
//			}
//		 }),
			  new Ext.grid.RowNumberer(),
	          { text: 'id', hideable: false, hidden: true, dataIndex: 'id' },
	          { text: '版本号',dataIndex: 'versionCode',align:'center'},
	          { text: 'APK名称',  dataIndex: 'apkName',align:'center' },
	          { text: '是否强制更新', dataIndex: 'isMust',align:'center', width:100,
	        	  renderer: function(value) {
	        		  if(value=='1'){
	        			  return '是';
	        		  }else{
	        			  return '否';
	        		  }
//	        		  return Ext.String.format('<a href="mailto:{0}">{1}</a>', value, value);
	        	  }
	          },
	          { text: '版本', dataIndex: 'isnow',align:'center',width:80,
	        	  renderer: function(value) {
	        		  if(value=='1'){
	        			  return '当前版本';
	        		  }else{
	        			  return '历史版本';
	        		  }
	        	  }  
	          },
	          { text: '创建时间', dataIndex: 'createDate',width:150,align:'center',renderer: Ext.util.Format.dateRenderer('Y-m-d TH:i:s') },
	          { text: '安装包下载地址', flex:1,  dataIndex: 'url' ,align:'center'},
	          { text: '头像下载地址',flex:1,  dataIndex: 'userHeadUrl',align:'center'},
	          { text: '版本描述', flex:1,  dataIndex: 'description',align:'center' }
	          
	],
	constructor : function(config) {
	 		var me = this, 
	 		cfg = Ext.apply({}, config);
	 		me.store = me.getMyGridStore();
	 		me.bbar = me.getMyGridtoolbar();
	 		me.callParent([ cfg ]);

	 }      
});





//是否强制更新
var changstates = Ext.create('Ext.data.Store', {
    fields: ['val', 'name'],
    data : [
        {"val":"1", "name":"是"},
        {"val":"2", "name":"否"}
       
    ]
});
// 版本提交表单
Ext.define('myapp.myformpanel',{
	 extend:'Ext.form.Panel',
	 region:'north',
	 height:240,
	 title: '表单信息',
	 defaults:{
		 xtype:'textfield',
		 margin:'5 5 0 5'		 
	 },
     layout:'column',
     items: [
     {
         fieldLabel: 'URL',
         allowBlank: false,
         maxLength:300,
         name: 'versionvo.url',
         columnWidth: .5
     },
     {
    	 xtype:'combo',
         fieldLabel: '是否强制更新',
         name: 'versionvo.isMust',
         columnWidth: .5,
         mode : 'local',         
         resizable : false, 
         editable: false,
         lazyRender : true,
         displayField: 'name',
         valueField: 'val',
         allowBlank: false,
         store :changstates,
         value :"2"
     },{
    	 xtype:'numberfield',
         fieldLabel: '版本号',
         allowBlank: false,
         allowDecimals: false, // 是否与许小数 
         decimalPrecision: 0, // 小数位精度 
         allowNegative: false, // 是否允许负数 
         minValue: 1,
         name: 'versionvo.versionCode',
         columnWidth: .5
     },{  
         xtype: 'filefield',  
         name: 'upload',  
         fieldLabel: '附件',  
         columnWidth: 0.5,
         allowBlank: false,
         buttonText: '选择附件...'  
     },{ 
         xtype:"textarea",
         name:'versionvo.description',
         height : 80,
         fieldLabel : "更新说明",
         columnWidth: 1,
         maxLength:300,
         allowBlank: false,
         emptyText : "输入版本描述",
        }],
     buttons: [{
         text: '提交',
         formBind: true,
         disabled: true,
         
         handler: function() {
        	 var form = this.up('form').getForm();  
        	 var panl = this.up('form');
        	 
        	 //附件格式判断
        	 var upfilename = form.findField('upload').getValue();
        	 var b=upfilename.split(".");
        	 var n = b.length;
        	 if(n>1){
        		if( b[n-1].toLowerCase()!='apk'){
        			 Ext.Msg.alert('提示','只允许上传.apk文件');
        			return ;
        		}
        	 }else{
        		 return;
        	 }
        	 
        	 
        	 
        	 if(form.isValid()){
        		 form.submit({  
                     url : '/hoauapp/fileupload.action',  
                     waitMsg: '正在上传...',  
                     success: function(fp, o) {  
                    	 if(o.result.success){
                    		 Ext.Msg.alert('上传成功!',o.result.resultMsg); 
                    		 form.reset();
                    		 panl.up('panel').getMyGridpanel().getStore().loadPage(1);
                    	 }else{
                    		 Ext.Msg.alert('上传失败!',o.result.resultMsg);  
                    		
                    	 }
                    	  
                    	 
                     },  
                     failure : function (fp,o){  
                    	 Ext.Msg.alert('上传失败!',o.result.resultMsg);   
                    	 panl.up('panel').getMyGridpanel().getStore().loadPage(1);
                     }  
                });  
        	 }
        	 
        	  
         }
     }]
	
});




Ext.define('MyApp.MyPanel', {
     extend:'Ext.Panel',
     layout:'border',
     height:600,
     frame:true,
//     bodyPadding : 5,
     myformpanel:null,
     getMyformpanel:function(){
    	if(this.myformpanel==null){
    		this.myformpanel=Ext.create('myapp.myformpanel');
    	}
    	return this.myformpanel;
     },
     myGridpanel:null,
     getMyGridpanel:function(){
    	 if(this.myGridpanel==null){
    		 this.myGridpanel=Ext.create('myapp.mygridpanel');
    	 }
    	 return this.myGridpanel;
     },
     constructor : function(config) {
 		var me = this, 
 		cfg = Ext.apply({}, config);
 		me.items =[me.getMyformpanel(),
 		           me.getMyGridpanel()
 		           ];
 		me.callParent([ cfg ]);

 	 }

 });

 Ext.application({
     name   : 'MyApp',
     launch : function() {

         Ext.create('MyApp.MyPanel', {
             renderTo :Ext.getBody()
         })

        
     }
 });