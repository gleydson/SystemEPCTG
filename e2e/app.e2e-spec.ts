import { SystemEPCTGFrontEndPage } from './app.po';

describe('system-epctg-front-end App', function() {
  let page: SystemEPCTGFrontEndPage;

  beforeEach(() => {
    page = new SystemEPCTGFrontEndPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
