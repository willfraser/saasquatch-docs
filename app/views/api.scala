@main(
    "Recurly Integration",
    "Referral SaaSquatch’s Recurly integration uses Recurly’s Push Notifications and Recurly's API to automatically track subscriptions and give people discounts. This guide will walk you through how to set up this integration."
) {
    <section id="recurly">
        <div class="page-header">
            <h1>Recurly Integration</h1>
        </div>
        
        <p class="lead">
        Referral SaaSquatch’s Recurly integration uses Recurly’s Push Notifications and Recurly's API to automatically track subscriptions and give people discounts. This guide will walk you through how to set up this integration.
        </p>
        
        <hr/>
        <h3><span class="label label-success">Step 0</span> Things you need to know before you start</h3>
        
        <ul class="unstyled">
            <li>
                <b>Test mode vs. live mode</b> - We let you test your referral program using a Recurly Sandbox account and fake credit cards before deploying to your production environment. To set up test mode, just follow this guide using 1) your Recurly Sandbox account and 2) your test mode tenant_alias (it starts with “test_”)
            </li>
        </ul>

        <hr/>
        <h3><span class="label label-success">Step 1</span> Add your Recurly API Key in the SaaSquatch Portal</h3>
        
        <p>
        We connect to the Recurly API using your Recurly API key. This lets us automatically apply discounts to people’s accounts.
        </p>
        <ol>
            <li><a href="https://app.recurly.com/login">Login to Recurly</a> and click on “Developer-> API Credentials”. <b>Copy the “API key”</b>.</li>
            <li><a href="http://app.referralsaasquatch.com">Login to Referral SaaSquatch</a> and go to “Setup” and click “Authorize”. <b>Paste in your Recurly API key that you just copied</b>, and press connect.</li>
            <li>Repeat this process for both your <b>test</b> and <b>live</b> accounts.</li>
        </ol>
        <p class="muted">
            <b>Note:</b> It is not required to setup a test environment but it will make testing easier for you.
        </p>
        
        <hr/>
        <h3><span class="label label-success">Step 2</span> Set up Recurly to forward Push Notifications to SaaSquatch</h3>
        
        <p>
        Referral SaaSquatch uses Recurly push notifications as triggers to know when accounts need to be updated. If you’re already using push 
        notifications then you’ll have to set up push notification forwarding. To set up Recurly to forward Push Notifications to us, you just need to 
        set our Push Notification URL as the endpoint in the Recurly portal.
        </p>
        <ol>
            <li><a href="http://app.referralsaasquatch.com">Login to Referral SaaSquatch</a> and go to “Setup”. <b>Copy the URL labelled Push Notification URL</b>. (it should look like https://app.referralsaasquatch.com/recurly/{tenant_alias}/webhook)</li>
            <li><a href="https://app.recurly.com/login">Login to Recurly</a> and go to Developer -> Push Notifications -> Configure. <b>Paste the URL you just copied</b> it into the field labeled Push Notification URL in Recurly. Press Update Configuration to save the URL and complete this step.</li>
            <li>Repeat this process for both your <b>test</b> and <b>live</b> accounts.</li>
        </ol>
        
        <hr/>
        
        <div class="well">
            
            <h5><span class="label">Optional</span> Referral SaaSquatch forwards to you</h5>
            
            <p>
            If you are already using push notifications in your app, then you will want to set up push notifications to get forwarded from Referral SaaSquatch to you.
            </p>
            <ul>
                <li><a href="http://app.referralsaasquatch.com">Login to Referral SaaSquatch</a>, go to “setup” and under “Push Notification Forwarding URL” press the button labeled Reset.</li>
                <li>Paste the URL you would like Referral SaaSquatch to forward push notifications to into the URL field.</li>
                <li>Press the button labeled reset to complete.</li>
            </ul>
            <p>
            When we forward push notifications to you, we act as a transparent proxy so any errors from your app will bubble up to Recurly and trigger Recurly’s webhook retry policies.
            </p>
        </div>
        <div class="well">
            <h5><span class="label">Optional</span> Alternative integration - Forward to Referral SaaSquatch</h5>
                 
            <p>
            If you are currently use push notifications, then you can forward push notification to us instead of us forwarding to you. When you receive Recurly Push Notifications you will need to build a solution that forwards all incoming Push Notifications to our endpoint.
            </p>
            
            <ul>
                <li>Push notifications that you forward do not need to be guaranteed. The next time we get a push notification from you, we’ll fully sync the info from the related accounts.</li>
                <li>Push notifications that you forward can be duplicated. If you send us the same notification twice, our system will just look at the current state of things and act accordingly.</li>
            </ul>
            
            <p>
            Please feel free to contact support@@saasquat.ch to talk to a developer about how to build this yourself.
            </p>
        </div>

        <hr/>
        
        <h4>More information </h4>

        <ul>
            <li><b>Recurly API Keys</b> - We connect to the Recurly API using your Recurly API key. This lets us automatically apply discounts to people’s accounts. While this makes setting up our integration extremely powerful, easy and fast, sharing API keys is not officially supported by Recurly.</li>
        </ul>
        
        <p>Check out our <a href="/bestpractices/common-pitfalls">Common Pitfalls Guide</a></p>


    </section>
}
